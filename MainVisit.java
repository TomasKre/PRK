import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainVisit {
    private static class Visitor extends PRKBaseVisitor<Integer> {

        @Override
        public Integer visitParenthesis(PRKParser.ParenthesisContext ctx) {
            return visit(ctx.expressionPRK());
        }

        @Override
        public Integer visitPowSqr(PRKParser.PowSqrContext ctx) {
            int left = visit(ctx.expressionPRK(0));
            int right = visit(ctx.expressionPRK(1));
            if (ctx.op.getType() == PRKParser.POW) {
                return (int) Math.pow(left, right);
            } else {
                return (int) Math.pow(left, 1/right);
            }
        }

        @Override
        public Integer visitMulDiv(PRKParser.MulDivContext ctx) {
            int left = visit(ctx.expressionPRK(0));
            int right = visit(ctx.expressionPRK(1));
            if (ctx.op.getType() == PRKParser.MUL) {
                return left * right;
            } else {
                return left / right;
            }
        }

        @Override
        public Integer visitAddSub(PRKParser.AddSubContext ctx) {
            int left = visit(ctx.expressionPRK(0));
            int right = visit(ctx.expressionPRK(1));
            if (ctx.op.getType() == PRKParser.ADD) {
                return left + right;
            } else {
                return left - right;
            }
        }

        @Override
        public Integer visitInt(PRKParser.IntContext ctx) {
            return Integer.valueOf(ctx.getText());
        }

        @Override
        public Integer visitFloat(PRKParser.FloatContext ctx) {
            return Integer.valueOf(ctx.getText());
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        PRKLexer lexer = new PRKLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PRKParser parser = new PRKParser(tokens);
        ParseTree tree = parser.expressionPRK();

        Visitor eval = new Visitor();
        System.out.println(eval.visit(tree));
    }
}
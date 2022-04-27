# Programming language 4kids

## Data types

### Integer

&#128290;   32bit

&#128290; = "0" | ["+" | "-"] non-zero (digit)* | &#127345; (zero-one)* | &#127344; (hexa-digit)*

non-zero = "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"

digit = non-zero | "0"

zero-one = "0" | "1"

hexa-digit = "a" | "b" | "c" | "d" | "e" | "f" | "A" | "B" | "C" | "D" | "E" | "F" | digit

### Floating point

&#128291;   32bit

&#128291; = ["+" | "-"] (digit)+ . (digit)+

### Char

&#128289; = "'" char "'"

char = hexa-digit | "g" | "h" | "i" | "j" | "k" | "l" | "m" | "n" | "o" | "p" | "q" | "r" | "s" | "t" | "u" | "v" | "w" | "x" | "y" | "z" | "G" | "H" | "I" | "J" | "K" | "L" | "M" | "N" | "O" | "P" | "Q" | "R" | "S" | "T" | "U" | "V" | "W" | "X" | "Y" | "Z"

### String

&#128288; = """ (char | symbol)* """

symbol = "_" | "." | "," | " " | "\n" | "\r" | ":" | ";" | "?" | "!" | "~" | "+" | "-" | "*" | "/" | "="

### Boolean

&#10067;    1bit (1byte)

&#10067; = &#10004; | &#10060;

&#10004;    true

&#10060;    false

## Operands

&#11013;   assign

&#10006;   multiply*

&#10133;   plus

&#10134;   minus

&#10135;   divide

&#10024;&#10006; power

&#10024;&#10135; root

## Brackets

&#9654;   opening bracket

&#9664;   closing bracket

## Priority of operations

1st level: &#9654; & &#9664;

2nd level: &#10024;&#10006; & &#10024;&#10135;

3rd level: &#10006; & &#10135;

4th level: &#10133; & &#10134;

## Test calculator

1. Open preferably Git Bash (Windows cmd doesn't work) at directory with this project.
2. Type: [echo "<your_expression>" | java MainVisit] OR [java MainVisit "<input_filename>"]
3. Output will be printed to console

At the moment calculator supports: power, square, multiplication, division, addition, substraction and parenthesis.

## Emoji to Unicode dictionary

| Unicode | Emoji     | Decimal |
|:-------:|:---------:|:-------:|
| U+1F522 | &#128290; | 128290  |
| U+1F523 | &#128291; | 128291  |
| U+1F521 | &#128289; | 128289  |
| U+2753  | &#128288; | 128288  |
| U+1F523 | &#10067;  | 10067   |
| U+1F521 | &#10004;  | 10004   |
| U+2753  | &#10060;  | 10060   |
| U+2B05  | &#11013;  | 11013   |
| U+2716  | &#10006;  | 10006   |
| U+2795  | &#10133;  | 10133   |
| U+2796  | &#10134;  | 10134   |
| U+2797  | &#10135;  | 10135   |
| U+25B6  | &#9654;   | 9654    |
| U+25C0  | &#9664;   | 9664    |
| U+1F171 | &#127345; | 127345  |
| U+1F170 | &#127344; | 127344  |
| U+2728  | &#10024;  | 10024   |

---

*according to browser, operating system and their versions multiply and plus might be shown as same emoji


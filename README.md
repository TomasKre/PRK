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

&#128289; = "'" [0-9a-zA-Z] "'"

### String

&#128288; = """ (&#128289; | symbol)* """

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

## Emoji to Unicode dictionary

U+1F522   &#128290;

U+1F523   &#128291;

U+1F521   &#128289;

U+1F520   &#128288;

U+2753    &#10067;

U+2714    &#10004;

U+274C    &#10060;

U+2B05  &#11013;

U+2716  &#10006;

U+2795  &#10133;

U+2796  &#10134;

U+2797  &#10135;

U+25B6  &#9654;

U+25C0  &#9664;

U+1F171 &#127345;

U+1F170 &#127344;

U+2728 &#10024;

---

*according to browser, operating system and their versions some emojis might show multiply and plus as same emoji


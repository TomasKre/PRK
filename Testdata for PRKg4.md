# Testovací data

## Data types

### Boolean

* OK  -> ✔; ❌;
* NOK -> true; false; 0; 1; abc;

### Integer

* OK  -> 0; 1; +1; -1; -99999999; 🅰0; 🅰a; 🅰F; 🅰0101; 🅱0; 🅱1; 🅱0101;
* NOK -> a; F; abc; -0; +0; ++100; --500; 🅰🅰0; 🅱🅱1;

### Float

* OK  -> 0.0; 0.9; 0.999999999; 1.0; +1.0; -1.0; +0.0; -0.0;
* NOK -> 0; +0; -0; 1000; 0..0;

### Char

* OK  -> 'a'; 'A'; 'f'; 'Z'; 'z'; '0'; '9';
* NOK -> ''; '.'; '_'; ''a; a'';

### String

* OK  -> ""; " "; "abc"; "z"; "_"; "\n"; "."; "/*-+="; "0";
* NOK -> "✔"; "❌"; "'"; "[]"; "()";

## Declarations

### Boolean

* OK  -> ❓ promenna ⬅ ✔\n; ❓nazev⬅❌\n; ❓ _⬅ ❌   \n;
* NOK -> ❓ ⬅ ✔\n; ❓nazev❌\n; ❓ _⬅ ❌   ; nazev ⬅ ✔\n;

### Integer

* OK  -> 🔢 promenna ⬅ 100\n; 🔢nazev⬅0\n; 🔢 _⬅🅰01A   \n; 🔢 _⬅🅱11\n;
* NOK -> 🔢 ⬅ 100\n; 🔢nazev100\n; 🔢 _⬅ 100   ; nazev ⬅ 100\n;

### Float

* OK  -> 🔣 promenna ⬅ 1.0\n; 🔣nazev⬅0.0\n; 🔣 _⬅-3.14   \n;
* NOK -> 🔣 ⬅ 1.01\n; 🔣nazev1.01\n; 🔣 _⬅ 1.01   ; nazev ⬅ 1.01\n;

### Char

* OK  -> 🔡 promenna ⬅ 'a'\n; 🔡nazev⬅'F'\n; 🔡 _⬅'Z'   \n;
* NOK -> 🔡 ⬅ 'a'\n; 🔡nazev'a'\n; 🔡 _⬅ 'a'   ; nazev ⬅ 'a'\n;

### String

* OK  -> 🔠 promenna ⬅ "    "\n; 🔠nazev⬅"Hello"\n; 🔠 _⬅"-3.14"   \n;
* NOK -> 🔠 ⬅ "string"\n; 🔠nazev"string"\n; 🔠 _⬅ "str"   ; nazev ⬅ "str"\n;

## Přiřazení, výrazy, řádky

### Expression

* OK  -> ▶ x ◀; ▶ 5➕8 ◀; 5✖8; 10➖1.0; 8.0➗1.0; 3✨✖2; var✨➗2; var ➕ ▶ x ◀;
* NOK -> ▶◀; ◀x▶; ◀▶; 1+1; 1-1; 1*1; 1/1; var▶x◀; 5✖✖8; 5✖8✨➕3;

### Assignment

* OK  -> nazev⬅▶ x ◀; nazev⬅▶ 5➕8 ◀; nazev⬅5✖8; nazev⬅10➖1.0; nazev ⬅8.0➗1.0; nazev⬅ 3✨✖2; nazev ⬅ var✨➗2; nazev ⬅ var ➕ ▶ x ◀; nazev⬅var; nazev⬅3.0; nazev⬅5; ___⬅5; var_varouci⬅5✖5;
* NOK -> nazev⬅▶◀; nazev⬅◀x▶; nazev⬅; nazev⬅?;

---

Každý vstup je ukončen středníkem
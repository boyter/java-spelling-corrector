# java-spelling-corrector
A MIT Licensed Java Spelling Corrector

This came about because I was unable to find a liberally licenced spelling corrector for Java that was basicly a simple class. 
Makes the following assumptions,

1. You will supply the word's that will be used for comparisons.
2. You are responsible for cleaning the words. If you put in init_something then by golly it will assume thats a vaild word to match on.
3. It assumes that whatever was typed at least got the first letter correct.
4. Only spans out as far as 2 changes from for words, so "wong" will match "wrongs" but "woz" will not.
5. Does not letter flip checks to see if someone typed things backwards IE "wrogn" matching "wrong" although it should work anyway due to 4.
6. Takes exact length matches over lesser, so "wrongz" will correct to "wrongs" over "wrong"

It's tries to be as fast as possible and use as little memory as it can.

Usage is fairly simple.

`ISpellingCorrector sc = new SpellingCorrector(10000);`

`sc.putWord("wrong");`

`sc.correct("wrongs"); // Will return wrong`

Happy hacking.

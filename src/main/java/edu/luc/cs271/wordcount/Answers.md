# Questions & Answers

## Try using a `TreeMap` instead of a `HashMap`. Does this make any difference?
I tried to chang `HashMap` to `TreeMap` in `main` and `TestWordCounter`.
It looks like both of them work normally, but `TestWordCounter` seems a little bit slower. 

## What happens if you invoke `countWords` multiple times for different String iterators?
It will put all the iterators in the same `map` and `list`, and print the frequencies of all words.

## What crucial role does the Iterator abstraction play in making `WordCounter` testable?
The Iterator abstraction make it possible to use a `while` loop to `put` elements into the `map`, which makes the `map` nonempety to be tested.

## The 10 most frequent words and their frequencies in the downloaded file:
[=47033, the=36828, of=18020, and=13266, a=13176, to=12485, in=10010, he=8452, was=7610, that=6714]<br>
[=47033, the=36828, of=18020, and=13266, a=13176, to=12485, in=10010, he=8452, was=7610, that=6714, his=5788]<br>
I did not know what the first one is, so for the second time, I printed the first 11 elements of the `list`.
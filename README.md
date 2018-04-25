# trop-tools
short programs for analyzing the cantillation marks of the torah (pentateuch/21 books)

if one looks in the printed text of the bible, they will see letters (glyphs representing consonants) which are marked with vowels (points and lines above below and generally around the text) and cantilation marks (which denote syntax, stress, and "musical value").
in a torah scroll (or other scrolls) one will see only the letters.
a skilled reader can reconstruct the words, including vowels, from only the letters (jst lk sklld nglsh rdrs cn prbbly rd ths).
is it possible to reconstruct the trop (yiddish word referring to the cantilation marks) from just the letters as well?

this project aims to provide tools towards reconstructing the rules by which trop are attached to words.
[note: the rest of this will conveniently ignore the books Iyov (Job), Mishlei (Proverbs) and Tehilim (Psalms) as they follow a different cantillation system,
we are focusing instead on the other 21 books, "the 21 books", and in particular the 5 books of the pentateuch.
i will also use the ashkenazi names for these marks as i am ashkenazi and used to them]

much is known about this question.
the trop are divided into disjunctives (which come in 4 levels) and conjunctives.
some conjunctives and disjunctives always or usually come together.
the disjunctives divide verses in a recursive sort of way.
for more specifics see the wikipedia article [https://en.wikipedia.org/wiki/Cantillation].

these tools should be able to answer questions (and provide relevant examples) for questions like:
- how often is the 2nd level disjunctive before a tipchah a segol?
- more generally, what is the difference between a pashta zakef-qaton and zarqa segol sequence (syntactically)?
- when is the conjunctive before a tevir a merchah and when is it a darga?
- is a revii ever the disjunctive immediately preceeding a zaqef gadol? how about preceeding a tipchah?
- when is the fourth level disjunctive before a tevir an azla/geresh and when is it a telishah gedolah?
# Interesting times

-	reconciled two methods (times()) by first inlining the methods they called and then replacing constants with variables
-	Wrote a toString() without a test just to help us debug
-	Tried a change (returning Money instead of Franc) and let the tests tell us whether it worked
-	Backed out an experiment and wrote another test.Making the test work made the experiment work.

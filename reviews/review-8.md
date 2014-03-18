#Make in Objects

-	Took a step towards eliminating duplication by reconciling the signatures of two variants of the same method (times())
-	Moved at least a declaration of the method to the common superclass
-	Decoupled test code from the existence of concrete subclases by introducing factory methods
-	Noticed that when the subclasses disappear some tests will be redundant ,but took no action

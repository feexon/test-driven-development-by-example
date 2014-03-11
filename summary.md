#Summary
- the problem with the test and code is dependency,you can't change one without another.we can eliminating duplication to eliminating dependency.
- if you can make the steps too small,you can certainly make steps the right size.if you only take larger steps,you'll never know if smaller steps are appropriate.
- start with the simple solution and grow the design organically. 
- add unnecessary items at the moment,and move on to others.
- 降低测试与产品代码之间的依赖，能够创建出低耦合、高内聚的代码。

#TDD cycle - goal[clean code that works]

1. **write a test**.Think about how you would like the operation in your mind to appear in your code.
2. **make it run**.Quickly get that bar green dominates everything else.
3. **make it right**.Remove the duplication that you have introduced to get to quick green.

# 3 Strategies to get the test green quickly
- **Fake It** -- return a constant and gradually replace constant with variables util you have the real code.
- **Obvious Implementation** -- type in the real implementation.
- **Triangulation**

# Contributing
When contributing to this repository, please first discuss the change you wish to make via issue,
email, or any other method with the owners of this repository before making a change.

This project believes in the principles of Clean Code. See an overview below.

Please note we have a code of conduct, please follow it in all your interactions with the project.

## Pull Request Process
1. Ensure any install or build dependencies are removed before the end of the layer when doing a 
   build.
2. Update the README.md with details of changes to the interface, this includes new environment 
   variables, exposed ports, useful file locations and container parameters.
3. Increase the version numbers in any examples files and the README.md to the new version that this
   Pull Request would represent. The versioning scheme we use is [SemVer](http://semver.org/).
4. You may merge the Pull Request in once you have the sign-off of two other developers, or if you 
   do not have permission to do that, you may request the second reviewer to merge it for you.
   
## Clean Code
### What Is Clean Code?
The code can be measured with either "good" or "bad" in the code review or by how many minutes it takes you to talk about it.

A clean code should be elegant, efficient, readable, simple, without duplications, and well-written. 

You should add value to the business with your code.

Clean code offers quality and understanding when we open a class.

It is necessary that your code is clean and readable for anyone to find and easily understand. Avoid wasting others' time.

### Meaningful Names
Names of the classes, variables, and methods must be meaningful and clearly indicate what a method does or what an attribute is.

Create pronounceable names to facilitate communication.

Avoid acronyms and avoid confusing names, which may bring anyone who reads the code to the wrong conclusions.

Use names that reflect the system domain, the context, and the problems that must be solved.

### Functions
The method should be easy to read and understand.

The method should convey its intention.

The methods should be small. Another rule for small methods is that they should be even smaller.

They must have up to 20 lines. (I think they should have up to 10 lines.)

Methods should only do one thing: they should do it the right way and just do it.

You should use names with words that say what it really does.

The optimal number of parameters of a method is zero, after one and two.

Three should be avoided, but if you think it should be used, have a good justification.

Parameters of the Boolean type as a parameter already clearly states that it does more than one thing.

Methods must do something and return something.

Avoid duplication.

### Comments
One of the most common reasons for the comments is because the code is bad.

If you're thinking about writing a comment, then the code should be refactored.

Comments do not save a bad code.

Try to explain what the code causes to happen.

Comments can be useful when placed in certain places.

Create method names and informative variables instead of explaining the code with comments.

Comments can be used to express the importance of certain points in the code.

The best comment is one that needs to be written because your code already explained.

Do not write comments with redundant, useless, or false information.

They should not be used to indicate who changed or why, for that already exists in versioning.

Don’t comment code that will not be used, remove, it just pollutes the code and leaves no doubt in anyone reading.

### Formatting
Formatting should indicate things of importance since it is a developer of communication form.

A messy code is hard to read.

The readability of the code will take effect on all of the changes that will be made.

Try to write a class with a maximum of 500 lines. Smaller classes are easier to understand.

Set a limit of characters per line of code.

A good character limit on a line is 120.

Try to keep more next related concepts vertically to create a code stream.

Use spaces between operators, parameters, and commas.

### Objects and Data Structure
Follow the Law of Demeter, which says that one M method of an object O can only consume services of the following types of objects:
- The object itself, O.
- The M parameters.
- Any object created or instantiated by M.
- Direct components of O.

Make good abstraction and encapsulation.

Do not make dumb objects.

Objects hide the data abstraction and expose methods that operate the data.

Data structures expose your data and do not have significant methods.

### Error Handling
Error handling should be planned carefully by all programmers.

When wrong things occur, we have to get it to do the right things.

We should give preference to launching an exception than treating it just to hide.

Create messages with information about the error.

Mention that it failed. Where was this failure? If possible, mention why it failed.

Look at separate business rules for errors and error handling.

Avoid returning a NULL in methods, preferably to return an empty object.

Avoid passing NULL to the methods; this can generate NullPointerExceptions.

### Boundary
In third-party code, to avoid passing objects, APIs look forward in order to keep things in the same class.

Performs tests on the API's third party.

Study the documentation and test the third API before you start using it.

Check well the features you will use.

These steps can help increase yield when there are new updates to the API and you can only run your tests to check for this update.

Create tests the functionality of the API.

### Unit Tests
Make sure each piece of code is doing what you expect it to do.

Follow the TDDs law: 
- Don't create code before you have a failing test.
- Don't create more tests than necessary to fail. 
- You cannot write more code than enough to pass the test that is failing.
- Keep your test clean.

The tests must undergo changes in the same way that the code.

The dirtier the code, the more difficult test will be to maintain.

Use the F.I.R.S.T rule for testing:
- The test is fast-running.
- The tests are independent of other.
- The test is repeatable in various environments.
- The test is self-validating.
- The test is timely.
- The test is as important as the production code.

### Classes
By default, Java classes should start with the variables:
- Static and constantly public.
- Static and variable private.
- Instances and variables privates.
- Soon after comes the functions.
- The class name should represent your responsibility.

The class must have only one responsibility.

To know the size of the class is ideal or we should not measure her responsibility.

You should try to make a brief description of the class.

The methods should be:

Small...
...and even smaller.

They must have only one responsibility.

### Systems
It is important to recognize and separate responsibilities of a system.

It should be separate and modularize the logic execution, allowing an independent strategy for solving application dependency.

Is important to take care of dependency injections and to allow only objects to take care of the business of logic.

It is very difficult to create a system properly first. It must be made available to the story, then refactored, and then expanded to continue implementing new stories.

To get to the point that TDD is necessary, you need refactoring and clean code.

We must build POJOs-based logic through testing and evolve from simple to interconnect the various aspects necessary.

### Emergence
Here are the rules that are given by Kent Beck to create good designs:
- Run all tests. They verify that the system behaves as expected.
- Eliminate duplication because duplicate code brings additional work.
- To express the intention of the programmer, use more expressive code to facilitate maintenance. Choose good names for functions, classes and tests shouldn’t be small and well written. 
- Minimize the number of classes and methods. Following this pattern can ignore it if the classes are very small.
- Apply all knowledge to improve the design during refactoring. Increase cohesion, reduce coupling, separate responsibilities, reduce classes and methods, choose the best names.
- Even applying it once, you will not be able to have good software. You need to do this over and over again to achieve continuous improvement.

### Concurrence
The concurrency is an aspect that may be present in the codes.

Uncoupling allows for improving the yield and structure of an application.

The concurrency can improve response times and application efficiency.

You should consider the following ideas about the concurrence:
- It injects a certain overload.
- It can be complex to operate.
- Errors caused by it can be difficult to reproduce.
- It usually requires design changes.

The concurrence problem is that different segments of an application may be following tangled multi-threading, which can cause unexpected problems in normal situations.

For concurrence reasons, it is important that each class has a unique responsibility. 

Create sections that are synchronized and minimized. Running tests often is the best way to find any errors in the code. However, it is difficult to do when there are concurrence tests.

A good way to test is to insert codes for testing in the middle of the implemented code.

### Successive Refinement
The code-only work is not enough to have a good code.

Professionals who care only about the code that works cannot be considered professional.

We should ignore that we have no time to refactor to one code. The code that was not taken care of today can become a problem after becoming a problem for the team because no one will want to mess with it.

Try not to let the code rot. It is much cheaper to create a clean code than cleaning a rotten code, as a move in a tangle can be an arduous task.

The solution, then, comes down to maintaining the cleanest code possible and as simply as possible without ever letting it begin to rot.

### JUnit
Look to cover tests each (not every method, but each code line).

### Refactoring
No code is immune to improvement, and each of us has a responsibility to make the code a little better than we found it.

Refactoring is an iterative process full of trial and error, inevitably converging to something that we feel is worthy of a professional.

Before making any kind of refactoring, it is important to have good coverage tests.

After increasing or creating test coverage, you can begin to leave the clearest code and fix some bugs.

Now, after leaving the code clearer, someone else can probably clean it even more.

### Java
Avoid long lists of import using \*.

Do not inherit constants. Instead, use enums constants.

### Names
Choose descriptive names.

Choose names at the appropriate level of abstraction.

Use standard nomenclature where possible.

Use long names for long scopes.

Avoid encodings.

Names should describe side effects.

### Conclusion
Clean code is not written following a set of rules. You do not become a software professional just by learning a list of what you do and what you've done.

Professionalism and craftsmanship come from values and discipline in lists of what you should and should not do when creating a code.

Please see [Clean Coders: Library][cleancode]

## Code of Conduct

Please review the [Contributor Covenant][homepage], version 1.4,
available at [http://contributor-covenant.org/version/1/4][version]

[cleancode]: https://cleancoders.com/videos
[homepage]: http://contributor-covenant.org
[version]: http://contributor-covenant.org/version/1/4/

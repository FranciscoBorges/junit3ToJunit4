# Convert JUnit3 code into JUnit4

Script is not perfect, but it goes a long way towards dealing with the
most common problems.

Does not address calls to

```
junit.framework.TestSuite.addTestSuite(clazz);
```

for these you need to use `@RunWith(Suite.class)`.

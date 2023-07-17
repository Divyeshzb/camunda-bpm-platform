<project>
  ...
  <repositories>
    <repository>
      <id>third-party</id>
      <url>http://example.com/maven2</url>
    </repository>
    <!-- Add the repository that contains the missing package -->
    <repository>
      <id>missing-package-repo</id>
      <url>http://url-to-the-repo-that-contains-missing-package.com</url>
    </repository>
  </repositories>
  ...
</project>

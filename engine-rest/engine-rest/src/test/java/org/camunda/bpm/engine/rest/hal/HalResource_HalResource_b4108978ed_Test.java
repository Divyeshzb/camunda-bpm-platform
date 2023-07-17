<project>
  ...
  <build>
    ...
    <plugins>
      ...
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.0</version> <!-- Use the latest available version -->
        <configuration>
          <source>1.7</source> <!-- Use the Java version you want -->
          <target>1.7</target> <!-- Use the Java version you want -->
        </configuration>
      </plugin>
      ...
    </plugins>
    ...
  </build>
  ...
</project>

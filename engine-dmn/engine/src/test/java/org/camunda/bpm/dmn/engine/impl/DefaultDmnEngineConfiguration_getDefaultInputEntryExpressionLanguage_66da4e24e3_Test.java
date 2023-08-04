<project>
  [...]
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.0</version> <!-- use a newer version -->
        <configuration>
          <source>1.8</source> <!-- set source version to 8 (or higher) -->
          <target>1.8</target> <!-- set target version to 8 (or higher) -->
        </configuration>
      </plugin>
    </plugins>
  </build>
  [...]
</project>

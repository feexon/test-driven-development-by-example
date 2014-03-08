task :default=>[:test]

$sourceDir="src"
$outputDir="classes"

directory($outputDir)

task :test => [$outputDir,:set_class_path,:compile] do
	sh("java -cp #{CLASSPATH} org.junit.runner.JUnitCore MoneyTest")
end

task :set_class_path do
	CLASSPATH=[$outputDir,*Dir["libs/*.jar"]].join(";")
end

task 

task :compile do
	sh("javac -cp #{CLASSPATH} #{$sourceDir}/*.java -d #{$outputDir}")
end

require "rake/clean"
task :default=>[:test]

$source_dir="src"
$output_dir="classes"

def classpath
	[$output_dir,*Dir["libs/*.jar"]].join(";")
end

def jvm_options
	["-cp",classpath].join(" ")
end

directory($output_dir)

task :test => [$output_dir,:compile] do
	sh("java #{jvm_options} org.junit.runner.JUnitCore AllTests")
end

task :compile do
	sh("javac #{jvm_options} #{$source_dir}/*.java -d #{$output_dir}")
end

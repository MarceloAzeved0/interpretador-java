all:				Main.class


Main.class:     Main.java
				@javac Main.java

clean:
				@rm -rf *.class *~
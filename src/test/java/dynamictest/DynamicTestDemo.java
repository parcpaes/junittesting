package dynamictest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import testnulll.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DynamicTestDemo {
    @TestFactory
    public DynamicTest testReverse(){
        return dynamicTest("Dynamic test for reverse method",()-> {
           assertEquals("god",StringUtils.reverse("dog"));
        });
    }

    @TestFactory
    public String testReverseWithString(){
        return "dynamic test";
    }

    @TestFactory
    public Collection<DynamicTest> dynamicTestFromCollection(){
        List<String> inputList = createInputList();
        List<String> outputList = createOutputList();
        List<DynamicTest> dynamicTests = new ArrayList<>();
        for(int i=0;i<inputList.size();i++){
            String input = inputList.get(i);
            String output = outputList.get(i);
            DynamicTest dynamicTest = dynamicTest("Dynamic test for reverse():input "+input,()-> {
                assertEquals(output,StringUtils.reverse(input));
            });
            dynamicTests.add(dynamicTest);
        }
        return dynamicTests;
    }

    @TestFactory
    public Iterable<DynamicTest> dynamicTestFromIterable(){
        List<String> inputList = createInputList();
        List<String> outputList = createOutputList();
        List<DynamicTest> dynamicTests = new ArrayList<>();
        for(int i=0;i<inputList.size();i++){
            String input = inputList.get(i);
            String output = outputList.get(i);
            DynamicTest dynamicTest = dynamicTest("Dynamic test for reverse():input "+input,()-> {
                assertEquals(output,StringUtils.reverse(input));
            });
            dynamicTests.add(dynamicTest);
        }
        return dynamicTests;
    }

    @TestFactory
    public Iterator<DynamicTest> dynamicTestFromIterator(){
        List<String> inputList = createInputList();
        List<String> outputList = createOutputList();
        List<DynamicTest> dynamicTests = new ArrayList<>();
        for(int i=0;i<inputList.size();i++){
            String input = inputList.get(i);
            String output = outputList.get(i);
            DynamicTest dynamicTest = dynamicTest("Dynamic test for reverse():input "+input,()-> {
                assertEquals(output,StringUtils.reverse(input));
            });
            dynamicTests.add(dynamicTest);
        }
        return dynamicTests.iterator();
    }

    @TestFactory
    public Stream<DynamicTest> dynamicTestFromStream(){
        List<String> inputList = createInputList();
        List<String> outputList = createOutputList();
        List<DynamicTest> dynamicTests = new ArrayList<>();
        for(int i=0;i<inputList.size();i++){
            String input = inputList.get(i);
            String output = outputList.get(i);
            DynamicTest dynamicTest = dynamicTest("Dynamic test for reverse():input "+input,()-> {
                assertEquals(output,StringUtils.reverse(input));
            });
            dynamicTests.add(dynamicTest);
        }
        return dynamicTests.stream();
    }

    @TestFactory
    public Stream<DynamicTest> dynamicTestFromIntStream(){
        return IntStream.iterate(0,n->n+2).limit(10).mapToObj(
                n-> dynamicTest("test: "+n,()-> assertTrue(n%2==0))
        );
    }

    @TestFactory
    public DynamicTest[] dynamicTestFromArray(){
        List<String> inputList = createInputList();
        List<String> outputList = createOutputList();
        DynamicTest[] dynamicTests = new DynamicTest[inputList.size()];
        for(int i=0;i<inputList.size();i++){
            String input = inputList.get(i);
            String output = outputList.get(i);
            dynamicTests[i] = dynamicTest("Dynamic test for reverse():input "+input,()-> {
                assertEquals(output,StringUtils.reverse(input));
            });
        }
        return dynamicTests;
    }

    @TestFactory
    public Stream<DynamicNode> dynamicTestWithDynamicContainer(){
        return createInputList().stream()
                .map(input-> dynamicContainer("Container for "+input,Stream.of(
                        dynamicTest("not null",()-> assertNotNull(input)),
                        dynamicContainer("properties test",Stream.of(
                                dynamicTest("length>0",()-> assertTrue(input.length()>0)),
                                dynamicTest("not empty",()-> assertFalse(input.isEmpty()))
                        ))
                )));
    }
    private List<String> createOutputList() {
        return List.of("ecar", "mom", "dad", "tset");
    }
    private List<String> createInputList() {
        return List.of("race","mom","dad","test");
    }
}

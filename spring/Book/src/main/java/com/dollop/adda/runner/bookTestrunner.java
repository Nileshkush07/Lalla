/*
 * package com.dollop.adda.runner;
 * 
 * import java.util.Arrays;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.CommandLineRunner; import
 * org.springframework.stereotype.Component;
 * 
 * import com.dollop.adda.bean.Book; import com.dollop.adda.in.bookrepo;
 * //@Component public class bookTestrunner implements CommandLineRunner {
 * 
 * @Autowired private bookrepo r;
 * 
 * @Override public void run(String... args) throws Exception { // TODO
 * Auto-generated method stub r.saveAll(
 * 
 * Arrays.asList( new Book(101,"nilesh","Lalla",2000,"friction"), new
 * Book(102,"rahul","Lalla",2000,"sciencefiction"), new
 * Book(103,"raj","travel",2200,"drama"), new
 * Book(104,"nishant","nish",2500,"horror") )
 * 
 * );
 * 
 * //r.findBybid(103).forEach(System.out::println);
 * //r.findBybauthor("Lalla").forEach(System.out::println);
 * //System.out.println(rr);
 * //r.findBybcostLessThanEqual(2400).forEach(System.out::println); }
 * 
 * }
 */
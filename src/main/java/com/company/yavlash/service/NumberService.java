package com.company.yavlash.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberService {

  public List<Integer> putNumbersInList() throws FileNotFoundException {
    List<Integer> list = new ArrayList<>();
    String filePath = getClass().getResource("/input.txt").getFile() ;
    FileReader fileReader = new FileReader(filePath);
    Scanner scanner = new Scanner(fileReader);
    while(scanner.hasNext()){
      String line = scanner.nextLine();
      if(!line.equals("")) {
        list.add(Integer.parseInt(line));
      }
    }
    return list;
  }

  public List<Integer> sortList() throws FileNotFoundException {
    List<Integer> newList = putNumbersInList();
    Collections.sort(newList);
    return newList;
  }
}
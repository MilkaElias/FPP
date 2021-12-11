package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
        String ODD_DELIMITER = ""+(char)0;
        String filename;
        String text;
        public SymbolBalancer(String filename) {
            this.filename = filename;
            readFile();
        }
        public String getText() {
            return text;
        }

        boolean symbolsBalanced(String delimiters){

                    String text = getText();
                    Stack<Character> stack = new Stack<>();
                    ArrayList<Character> openChars = new ArrayList<>();
                    ArrayList<Character> closedChar = new ArrayList<>();

                    for(int i = 0; i <delimiters.length(); i+=2 ){
                        openChars.add(delimiters.charAt(i));
                        closedChar.add(delimiters.charAt(i+1));
                    }
                    boolean balanced = true;
                    for(int i = 0; i < text.length(); i++){
                        char currentChar = text.charAt(i);
                        if(currentChar == '|'){
                            balanced = !balanced;
                            continue;
                        }
                        if(openChars.contains(currentChar)){
                            stack.push(currentChar);
                        }if(closedChar.contains(currentChar)){
                            int openIndex = closedChar.indexOf(currentChar);
                            if(stack.peek().equals(openChars.get(openIndex))){
                                stack.pop();
                            }else {
                                return false;
                            }
                        }
                    }
                    if(stack.isEmpty() && balanced)
                        return true;
                    return false;
                }
                
        public static void main(String[] args) {
            SymbolBalancer sb = new SymbolBalancer("Employee.java");
            System.out.println(sb.getText());
            System.out.println(sb.symbolsBalanced("[]{}<>()||"));
        }
        void readFile() {
            try {
                Scanner sc = new Scanner(new File(filename));
                sc.useDelimiter(ODD_DELIMITER);
                text = sc.next();
                System.out.println(text);
                sc.close();
            }
            catch(FileNotFoundException ex) {
                System.err.println("File Not Found Exception "+ex.getMessage());
            }
        }

    }


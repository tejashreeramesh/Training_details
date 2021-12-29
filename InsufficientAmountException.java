package com.today;

public class InsufficientAmountException extends Exception{
private int amt;
public  InsufficientAmountException(int amt)
{
	this.amt=amt;
	System.out.println("InsufficientAmountException");
}
@Override
public String toString() {
	return "InsufficientAmountException [amt=" + amt + "]";
}

}

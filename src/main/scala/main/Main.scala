package edu.luc.cs.cs371.echo
package main

object Main:
  def main(args: Array[String]): Unit =
    val echos = Seq(new impl.SimpleEcho, new impl.DoubleEcho)
    for e <- echos do
      println(if e.isInstanceOf[impl.DoubleEcho] then e.echo("hello").replace(" ", "  ") else e.echo("hello"))
end Main

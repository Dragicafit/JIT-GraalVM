Compiled from "Fibo.java"
public class presentation.Fibo {
  public presentation.Fibo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: invokestatic  #7                  // Method java/lang/System.currentTimeMillis:()J
       3: lstore_1
       4: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
       7: bipush        45
       9: invokestatic  #17                 // Method fibo:(I)I
      12: invokevirtual #23                 // Method java/io/PrintStream.println:(I)V
      15: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
      18: invokestatic  #7                  // Method java/lang/System.currentTimeMillis:()J
      21: lload_1
      22: lsub
      23: invokedynamic #29,  0             // InvokeDynamic #0:makeConcatWithConstants:(J)Ljava/lang/String;
      28: invokevirtual #33                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      31: return

  static int fibo(int);
    Code:
       0: iload_0
       1: ifne          6
       4: iconst_0
       5: ireturn
       6: iload_0
       7: iconst_1
       8: if_icmpne     13
      11: iconst_1
      12: ireturn
      13: iload_0
      14: iconst_1
      15: isub
      16: invokestatic  #17                 // Method fibo:(I)I
      19: iload_0
      20: iconst_2
      21: isub
      22: invokestatic  #17                 // Method fibo:(I)I
      25: iadd
      26: ireturn
}

//reading file tablet.store using channel anf buffer
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class Test28 {
	public static void main(String[] args) throws Exception{
		RandomAccessFile file = 
	     new RandomAccessFile("C:\\sunil\\tablet.store","r"); 
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		FileChannel channel=file.getChannel();
		int length=channel.read(buffer);
		for(int i=0;i<length;i++) {
			System.out.print((char)buffer.get(i));
		}
		file.close();
		channel.close();
	}

}

//creating file using channel and buffer
//create a file tablet.store
//add contents as data
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.*;
public class Test27 {
	public static void main(String[] args) throws Exception{
		String data="iphone8  80000, samsung  60000\n"
				+ "iphone8  80000, samsung  60000\n"
				+ "iphone8  80000, samsung  60000\n"
				+ "iphone8  80000, samsung  60000\n"
				+ "iphone8  80000, samsung  60000";
		RandomAccessFile file= 
		new RandomAccessFile("C:\\sunil\\tablet.store","rw");
		ByteBuffer buffer = ByteBuffer.allocate(data.length());
		for(int i=0;i<data.length();i++) {
			buffer.put((byte)data.charAt(i));
		}
		FileChannel channel=file.getChannel();
		buffer.rewind();
		channel.write(buffer);
		System.out.println("1 file written");
		channel.close();
		file.close();
	}
}

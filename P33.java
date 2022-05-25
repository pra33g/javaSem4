import java.io.RandomAccessFile;
//33	WAP to create random access file and read & write integer data in it	
class P33{
	public static void main(String args[]){
		try {
			RandomAccessFile raf = new RandomAccessFile("Data.dat", "rw");
			raf.setLength(0);
			raf.writeInt(1);
			raf.writeInt(2);
			raf.writeInt(3);
			System.out.println("Written 3 integers (12 bytes) to file.");
			System.out.println("Length of file: " + raf.length());

			System.out.println("Reading file from end to beginning.");

			raf.seek(0);
			while (true){
				int read = raf.readInt();	
				System.out.println(read); 	
				if (raf.getFilePointer() == raf.length()){
					break;
				}
			}

			System.out.println("Seeking to 2nd integer and changing it.");
			raf.seek(1 * (Integer.SIZE / 8));
			raf.writeInt(256);
			
			System.out.println("Changed integer. And set length to 8 bytes");

			raf.setLength(8);

			System.out.println("Reading file from end to beginning.");
			raf.seek(0);
			while (true){
				int read = raf.readInt();
				System.out.println(read);
				if(raf.getFilePointer() == raf.length()){
					break;
				}
			}
			System.out.println("File length " + raf.length());
			raf.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
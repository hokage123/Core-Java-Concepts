import java.io.File;
//create Delete Rename
class Anki401
{
public static void main(String... s)throws Exception
{
File newFile=new File("my_new_file.txt");
printFileDetails(newFile);
//create a new file 
boolean fileCreated=newFile.createNewFile();
if(!fileCreated)
{
System.out.println(newFile+"could not be created");
}
printFileDetails(newFile);
//Delete the new File
newFile.delete();
System.out.println("After deleting the new File:");
printFileDetails(newFile);
//recreate the file
newFile.createNewFile();
printFileDetails(newFile);
//lets tell jvm to delete this file on exit
newFile.deleteOnExit();
System.out.println("After using deleteOnExit() method:");
printFileDetails(newFile);
//create a new File and Rename it
File firstFile=new File("my_first_file");
File secondFile=new File("my_second_file");
fileCreated=firstFile.createNewFile();
if(fileCreated||firstFile.exists())
printFileDetails(firstFile);
printFileDetails(secondFile);
boolean renamedFlag=firstFile.renameTo(secondFile);
if(!renamedFlag)
System.out.println("could not rename"+firstFile);
printFileDetails(firstFile);
printFileDetails(secondFile);
}
public static void printFileDetails(File f)
{
System.out.println("Absolute path:"+f.getAbsoluteFile());
System.out.println("File exist :"+f.exists());
}
}
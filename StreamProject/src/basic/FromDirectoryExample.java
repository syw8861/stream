package basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromDirectoryExample
{
	public static void main(String[] args)
	{
		Path path = Paths.get("c:/program files"); // c:/program에 있는 파일을 읽어온다 그래서 path에 담아주고
		try
		{
			Stream<Path> filestream = Files.list(path); //path에 있는 파일을 가져온다
			filestream.forEach((t)->System.out.println(t.getFileName()));
			filestream.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	
		
		
		//file
		path = Paths.get(".project"); //StreamProject 하위..root 디렉토리.
		try
		{
			Stream<String> FDEpath = Files.lines(path);
//			FDEpath.forEach((t)->System.out.println(t));
			FDEpath.forEach(System.out::println); // 이렇게 써도됨 t가 sout의 매개값으로 밖에 역할을 안하기때문에 이렇게도 쓸 수 있다.
			FDEpath.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
}

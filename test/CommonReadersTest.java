package src.srccode.test;

import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import src.srccode.data.CommonReaders;

class CommonReadersTest {
	CommonReaders objectUnderTest = new CommonReaders();
	List<String> mock = Mockito.mock(List.class);

	@Test
	void testCommonReader() {
		mock.add("one");
		mock.add("vlad");
		mock.add("car");
		mock.clear();

		verify(mock).add("one");
		verify(mock).add("vlad");
		verify(mock).add("car");
		verify(mock).clear();
	}

}

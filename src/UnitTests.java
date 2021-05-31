import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Test;


public class UnitTests {
	
	@Test
	public void sizeOfList8() {
		List<Integer> lista = new ArrayList<>();
		lista.add(23);
		lista.add(43);
		lista.add(11);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		
		// should be equal to 3
		assertEquals(8, lista.size());	
	}
	
	@Test
	public void sizeOfListEmpty() {

		List<Integer> lista = new ArrayList<>();

		
		// should be equal to 0
		assertEquals(0, lista.size());
	}
	
	@Test
	public void sizeOfListNull() {
		
		List<Integer> lista = null;
		
		//should throw null pointer exception
		assertThrows(NullPointerException.class, () -> {
	        lista.size();
	    });
	}
	
	@Test
	public void clearList5() {
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(10);
		lista.add(11);
		
		
		lista.clear();
		//should be equal to 0
		assertEquals(0, lista.size());
	}
	
	@Test
	public void clearListEmpty() {
		List<Integer> lista = new ArrayList<>();
		
		
		lista.clear();
		//should be equal to 0
		assertEquals(0, lista.size());
	}
	
	@Test
	public void clearListNull() {
		List<Integer> lista = null;
		
		
		
		//should throw null pointer exception
		assertThrows(NullPointerException.class, ()->{
			lista.clear();
		});
		
	}
	
	@Test
	public void addItems1() {
		List<String> lista =  new ArrayList<>();
		
		lista.add("item1");
		
		//should get item1
		assertEquals("item1", lista.get(0));
	}
	
	@Test
	public void addItemsNull() {
		List<Integer> lista = null;
		
		
		//should throw null pointer exception
		assertThrows(NullPointerException.class, ()->{
			lista.add(10);
		});
	}
	
	@Test
	public void addItems5() {
		List<String> lista = new ArrayList<>();
		lista.add("i1");
		lista.add("i2");
		lista.add("i3");
		lista.add("i4");
		lista.add("i5");
		
		//should have all the items in order
		assertEquals("[i1, i2, i3, i4, i5]", lista.toString());
		
	}
	
	@Test
	public void itemExists1() {
		List<String> lista = new ArrayList<>();
		lista.add("i1");
		
		//should contain i1
		assertTrue(lista.contains("i1"));
	}
	
	@Test
	public void itemExistsDuplicate() {
		List<String> lista = new ArrayList<>();
		lista.add("i2");
		lista.add("i1");
		lista.add("i1");
		lista.add("i1");
		lista.add("i2");
		
		//should contain i1
		assertTrue(lista.contains("i1"));
	}
	
	@Test
	public void itemExistsDeleted() {
		List<String> lista = new ArrayList<>();
		lista.add("i2");
		lista.add("i1");
		lista.add("i1");
		lista.add("i1");
		lista.remove("i2");
		
		//should not contain i1
		assertTrue(!lista.contains("i2"));
	}
	
	@Test
	public void elementByIndex3() {
		List<String> lista = new ArrayList<>();
		lista.add("i1");
		lista.add("i2");
		lista.add("i3");
		
		//should be equal to i2
		assertEquals("i2",lista.get(1));
	}
	
	@Test
	public void elementByIndexOutOfBounds() {
		List<String> lista = new ArrayList<>();
		lista.add("i1");
		lista.add("i2");
		lista.add("i3");
		
		//should throw exception
		assertThrows(IndexOutOfBoundsException.class, ()->{
			lista.get(4);
		});
	}
	
	@Test
	public void elementByIndexNegative() {
		List<String> lista = new ArrayList<>();
		lista.add("i1");
		lista.add("i2");
		lista.add("i3");
		
		//should throw exception
		assertThrows(IndexOutOfBoundsException.class, ()->{
			lista.get(-1);
		});
	}
	
	@Test
	public void getByIndexExists() {
		List<String> lista = new ArrayList<>();
		lista.add("i1");
		lista.add("i2");
		lista.add("i3");
		
		//should return 1
		assertEquals(1, lista.indexOf("i2"));
	}
	
	@Test
	public void getByIndexNoExists() {
		List<String> lista = new ArrayList<>();
		lista.add("i1");
		lista.add("i2");
		lista.add("i3");
		
		//should throw exception
		assertEquals(-1, lista.indexOf("i20"));
	}
	
	@Test
	public void getByIndexDuplicate() {
		List<String> lista = new ArrayList<>();
		lista.add("i1");
		lista.add("i2");
		lista.add("i2");
		
		//should return 1
		assertEquals(1, lista.indexOf("i2"));
	}
	
	@Test
	public void removeByIndex2() {
		List<String> lista = new ArrayList<>();
		lista.add("i1");
		lista.add("i2");
		lista.add("i3");
		
		//should return i2, should remove value
		
		assertEquals("i2", lista.remove(1));
		assertEquals("[i1, i3]", lista.toString());
	}
	
	@Test
	public void removeByIndexOutOFBounds() {
		List<String> lista = new ArrayList<>();
		lista.add("i1");
		lista.add("i2");
		lista.add("i3");
		
		//should throw exception ,should not remove value
		
		assertThrows(IndexOutOfBoundsException.class, ()->{
			lista.remove(4);
		});
		assertEquals("[i1, i2, i3]", lista.toString());
	}
	
	@Test
	public void removeByIndexNegative() {
		List<String> lista = new ArrayList<>();
		lista.add("i1");
		lista.add("i2");
		lista.add("i3");
		
		//should throw exception, should not remove value
		
		assertThrows(IndexOutOfBoundsException.class, ()->{
			lista.remove(-1);
		});
		assertEquals("[i1, i2, i3]", lista.toString());
	}

}

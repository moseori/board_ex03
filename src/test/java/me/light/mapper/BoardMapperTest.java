package me.light.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.light.config.AppTest;
import me.light.model.Board;

public class BoardMapperTest extends AppTest {
	@Autowired
	BoardMapper mapper;

	@Test
	public void geListTest() {
		List<Board> list = mapper.getList();
		assertEquals(5, list.size());
	}
}

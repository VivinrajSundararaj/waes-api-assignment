package com.waes.api.dao;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import com.waes.api.controller.DiffRequest;
import com.waes.api.dto.BinaryDataComparison;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Optional;

@RunWith(PowerMockRunner.class)
public class BinaryDataDaoTests {

	private static final Integer MOCK_ID = 42;

	@Mock
	private DiffRequest mockRequest;
	@Mock
	private BinaryDataRepository mockRepository;
	@Mock
	private BinaryDataComparison mockSavedObject;

	@InjectMocks
	private BinaryDataDao underTest = new BinaryDataDao();

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testsaveOrUpdateLeftNullID() {
		thrown.expect(IllegalArgumentException.class);
		underTest.saveOrUpdateLeft(null, mockRequest);
	}

	@Test
	public void testsaveOrUpdateLeftNullRequest() {
		thrown.expect(IllegalArgumentException.class);
		underTest.saveOrUpdateLeft(MOCK_ID, null);
	}

	@Test
	public void testsaveOrUpdateLeftValidData() {
		when(mockRepository.save(Matchers.any(BinaryDataComparison.class))).thenReturn(mockSavedObject);
		BinaryDataComparison savedObject = underTest.saveOrUpdateLeft(MOCK_ID, mockRequest);
		assertNotNull(savedObject);
	}

	@Test
	public void testsaveOrUpdateRightNullID() {
		thrown.expect(IllegalArgumentException.class);
		underTest.saveOrUpdateRight(null, mockRequest);
	}

	@Test
	public void testsaveOrUpdateRightNullRequest() {
		thrown.expect(IllegalArgumentException.class);
		underTest.saveOrUpdateRight(MOCK_ID, null);
	}

	@Test
	public void testsaveOrUpdateRightValidData() {
		when(mockRepository.save(Matchers.any(BinaryDataComparison.class))).thenReturn(mockSavedObject);
		BinaryDataComparison savedObject = underTest.saveOrUpdateRight(MOCK_ID, mockRequest);
		assertNotNull(savedObject);
	}

	@Test
	public void testGetDiffNullId() {
		thrown.expect(IllegalArgumentException.class);
		underTest.getDiff(null);
	}

	@Test
	public void testGetDiffValidData() {
		when(mockRepository.save(Matchers.any(BinaryDataComparison.class))).thenReturn(mockSavedObject);
		Optional<BinaryDataComparison> result = underTest.getDiff(MOCK_ID);
		assertNotNull(result);
	}

}

package com.bala.GamePool;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bala.GamePool.db.entity.MatchDetail;
import com.bala.GamePool.db.entity.User;
import com.bala.GamePool.db.entity.UserPrediction;
import com.bala.GamePool.db.entity.UserScore;
import com.bala.GamePool.db.entity.util.NextSequenceService;
import com.bala.GamePool.db.repo.MatchDetailsRepository;
import com.bala.GamePool.db.repo.UsersPredictionsRepository;
import com.bala.GamePool.db.repo.UsersRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GamePoolApplicationTests {


	@Autowired
	private UsersRepository usersRepository;
	@Autowired
	private UsersPredictionsRepository usersPredictionsRepository;
	@Autowired
	private MatchDetailsRepository matchDetailRepository;
	
	@Autowired
	private NextSequenceService nextSequenceService;

	@Before
	public void setUp() throws Exception {
		usersRepository.deleteAll();
		usersPredictionsRepository.deleteAll();
		
		User user = new User();
		user.setUserid(nextSequenceService.getNextSequence("usersequence"));
		user.setEmail("balajiachanta@gmailçom".toLowerCase());
		user.setCreatedttm(LocalDate.now());
		user.setUpdateddttm(LocalDate.now());
		user.setIsactive(Boolean.TRUE);
		user.setPassword("balubalu");
		user.setBonusleft(5);
		user.setVerifiedstatus(User.verfication.NOTDONE.ordinal());
		user.setIsadmin(Boolean.TRUE);

		user = usersRepository.save(user);

		System.out.println(user);
		
		UserPrediction userPredcion = new UserPrediction();
		userPredcion.setUserid(user.getUserid());
		userPredcion.setBonusbet(1);
		userPredcion.setHspred(4); // player collection
		userPredcion.setMatchid(7); // match collection
		userPredcion.setMompred(4); // player collection
		userPredcion.setPredid(nextSequenceService.getNextSequence("userpredsequence"));
		userPredcion.setTosspred(2); // 1 or 2
		userPredcion.setWinnerpred(2); // 1 0r 2
		
		UserScore userScore = new UserScore();
		userScore.setBonusscore(UserScore.score.WIN.ordinal());  // 0 or 1 
		userScore.setHsscore(UserScore.score.WIN.ordinal());
		userScore.setMomscore(UserScore.score.WIN.ordinal());
		userScore.setTossscore(UserScore.score.WIN.ordinal());
		userScore.setWinnerscore(UserScore.score.WIN.ordinal());
		userPredcion.setUserscore(userScore);
		
		userPredcion = usersPredictionsRepository.save(userPredcion);

		MatchDetail matchdetail = new MatchDetail();

		matchDetailRepository.save(matchdetail);
		
	}

	@Test
	public void testFetchData(){
		/*Test data retrieval*/
		User userA = usersRepository.findByEmail("balajiachanta@gmailçom");
		assertNotNull(userA);
		assertTrue(userA.isIsadmin());

	}

	@After
	public void tearDown() throws Exception {
		// this.usersRepository.deleteAll();
	}

}

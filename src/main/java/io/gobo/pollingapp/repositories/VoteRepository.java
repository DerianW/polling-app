package io.gobo.pollingapp.repositories;



import io.gobo.pollingapp.domain.Vote;
import org.springframework.data.jpa.repository.Query;



public interface VoteRepository extends CrudRepository<Vote, Long>
{



    @Query(value="select v.* from Option o, Vote v where o.POLL_ID = ?1 and v.OPTION_ID = o.OPTION_ID", nativeQuery = true)
            public Iterable<Vote> findByPoll(Long pollId);



}

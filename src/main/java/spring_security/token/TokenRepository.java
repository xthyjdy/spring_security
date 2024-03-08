package spring_security.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<TokenEntity, Long> {
    @Query("""
    SELECT t FROM TokenEntity t
        INNER JOIN UserEntity u
        ON t.user.id = u.id
        WHERE u.id = :userId
        AND (t.expired = false OR t.revoked = false)
    """)
    List<TokenEntity> findAllValidTokensByUserId(long userId);

    Optional<TokenEntity> findTokenByToken(String token);
}

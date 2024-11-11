package com.ivoyant.cassandra.cassandra_demo.repository;
import com.ivoyant.cassandra.cassandra_demo.entity.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CassandraRepository<User, String> {
}

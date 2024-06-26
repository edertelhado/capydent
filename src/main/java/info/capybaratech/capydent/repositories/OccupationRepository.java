package info.capybaratech.capydent.repositories;

import com.github.f4b6a3.ulid.Ulid;
import info.capybaratech.capydent.entities.Occupation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.Collection;
import java.util.Optional;

@Mapper
public interface OccupationRepository {
    Optional<Occupation> getById(@Param("id") Ulid id);
    void insert(@Param("occupation") Occupation occupation);
    void update(@Param("occupation") Occupation occupation);
    void delete(@Param("occupation") Occupation occupation);
    Collection<Occupation> filter(String description, Boolean enabled);
}

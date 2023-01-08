//package org.launchcode.trackmyeats.models;
//
//
//
//import org.launchcode.trackmyeats.models.User;
//
//import java.util.Objects;
//import java.util.Optional;
//
//@MappedSuperclass
//public abstract class AbstractEntity {
//
////    @Id
//    @GeneratedValue
//    private int id;
//
//    public int getId() {
//        return id;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        AbstractEntity that = (AbstractEntity) o;
//        return id == that.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//}
package com.practice.yogi.syaputra.java.spring.base.framework.Utils;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Date;

public class BaseSpecification<T> implements Specification<T> {

    private SearchCriteria criteria;

    public BaseSpecification(SearchCriteria criteria) {
        this.criteria = criteria;
    }

    @Nullable
    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

            if (criteria.getOperation().equalsIgnoreCase(">")) {
                return criteriaBuilder.greaterThanOrEqualTo(
                        root.get(criteria.getKey()).as(Date.class), (Date) criteria.getValue());
            }
            else if (criteria.getOperation().equalsIgnoreCase("<")) {
                return criteriaBuilder.lessThanOrEqualTo(
                        root.get(criteria.getKey()).as(Date.class), (Date) criteria.getValue());
            }
            else if (criteria.getOperation().equalsIgnoreCase(":")) {
                if (criteria.getKey().contains(".")){
                    String [] key = criteria.getKey().split("\\.");
                    return criteriaBuilder.like(
                            root.get(key[0]).get(key[1]), "%" + criteria.getValue() + "%");
                }else if (root.get(criteria.getKey()).getJavaType() == String.class) {
                        return criteriaBuilder.like(
                                root.<String>get(criteria.getKey()), "%" + criteria.getValue() + "%");
                } else {
                    return criteriaBuilder.equal(root.get(criteria.getKey()), criteria.getValue());
                }
            }
            return null;
    }
}

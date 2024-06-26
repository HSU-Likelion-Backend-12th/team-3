package spring.springcorebasic.discount;

import org.springframework.stereotype.Component;
import spring.springcorebasic.member.Grade;
import spring.springcorebasic.member.Member;
@Component
public class RateDiscountPolicy implements DiscountPolicy {
    private final int discountRate = 10;


    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP)
            return price * discountRate / 100;
        else
            return 0;
    }
}

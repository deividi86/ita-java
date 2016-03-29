package com.ita.week5;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by deividi.silva on 29/03/2016.
 */
public class AuthorityTest {



    @Test
    public void testInformalName(){
        Authority authority = new Authority(new InformalName(), "Deividi", "Silva");

        assertThat("Deividi", equalTo(authority.getTreatment()));
    }

    @Test
    public void testMaleRespectfulName(){
        Authority authority = new Authority(new RespectfulName("male"), "Deividi", "Silva");

        assertThat("Sr. Silva", equalTo(authority.getTreatment()));
    }

    @Test
    public void testFemaleRespectfulName(){
        Authority authority = new Authority(new RespectfulName("female"), "Maria", "Silva");

        assertThat("Sra. Silva", equalTo(authority.getTreatment()));
    }

    @Test
    public void testHonorificName(){
        Authority authority = new Authority(new HonorificTitleName("Doctor"), "Deividi", "Silva");

        assertThat("Doctor Deividi Silva", equalTo(authority.getTreatment()));
    }
}
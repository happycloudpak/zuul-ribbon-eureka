package com.svcmesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;

public class LoadBalancerConfiguration {
	//SELECT one of them 
	
	@Autowired
    IClientConfig ribbonClientConfig;

//	public IPing ribbonPing(IClientConfig config) {
//		System.out.println("RibbonPing");
//		return new PingUrl();
//	}

	@Bean
	public IRule ribbonRule(IClientConfig config) {
		System.out.println("RibbonRule: AvailabilityFilteringRule");
		return new AvailabilityFilteringRule();
	}
	
//	@Bean
//	public IRule ribbonRule(IClientConfig config) {
//		System.out.println("RibbonRule: WeightedResponseTimeRule");	
//		return new WeightedResponseTimeRule();
//	}

	
//	@Bean
//	public IRule riboonRule() {
//		System.out.println("RibbonRule: RoundRobin");
//		return new RoundRobinRule();
//	}	

}

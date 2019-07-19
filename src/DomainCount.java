import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DomainCount {

	public static void main(String[] args) {
		
		String[] cpdomains = {"9001 discuss.leetcode.com"};
		System.out.println(subdomainVisits(cpdomains));
	}
	
	public static List<String> subdomainVisits(String[] cpdomains) {
        
        Map<String, Integer> countByDomainMap = new HashMap<>();
        
        for(String domain : cpdomains) {
        	
        	String[] values = domain.split(" ");
        	
        	Integer	visitCount = Integer.parseInt(values[0]);
        	
        	String[] words = values[1].split("\\.");
        	
        	String subdomain = "";
        	
        	for(int i = words.length - 1; i >= 0 ; i--) {
        		
        		subdomain = words[i] + (("".equals(subdomain)) ? "" : ".") + subdomain; 
        
        		System.out.println(subdomain);
        		
        		Integer count = countByDomainMap.get(subdomain);
        		
        		count = (count == null) ? visitCount : count + visitCount;
        		
        		countByDomainMap.put(subdomain, count);
        	}
        }
        
        List<String> result = new ArrayList<>();
        
        for(Map.Entry<String, Integer> entry : countByDomainMap.entrySet()) {
        	
        	String output = entry.getValue() + " " + entry.getKey();
        	
        	result.add(output);
        }
        
        return result;
        
    }

}

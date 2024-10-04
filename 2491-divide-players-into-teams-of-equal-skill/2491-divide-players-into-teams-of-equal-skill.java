class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        if (n % 2 != 0) {
            return -1; // Number of players must be even
        }
        
        int skillSum = 0;
        for (int s : skill) {
            skillSum += s;
        }
        
        if (skillSum % (n / 2) != 0) {
            return -1; // Total skill points cannot be divided evenly
        }
        
        Arrays.sort(skill);
          long chemistry = 0;
        int left = 0, right = n - 1;
        
        while (left < right) {
            if (skill[left] + skill[right] != skillSum / (n / 2)) {
                return -1;
            }
            chemistry += (long) skill[left] * skill[right];
            left++;
            right--;
        }
        
        return chemistry;
    }
}
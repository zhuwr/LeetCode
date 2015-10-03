class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> hashMap;
        for(auto &v : strs) {
            string tmp(v);
            sort(tmp.begin(), tmp.end());
            hashMap[tmp].push_back(v);
        }
        vector<vector<string>> result(hashMap.size());
        int k = 0;
        for(auto it = hashMap.begin(); it != hashMap.end(); ++it, ++k) {
            result[k].swap(it->second);
            sort(result[k].begin(), result[k].end());
        }
        return result;
    }
};

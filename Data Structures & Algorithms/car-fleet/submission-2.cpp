class Solution {
public:
    int carFleet(int target, vector<int>& position, vector<int>& speed) {
        vector<pair<int, int>> v;
        for (int i = 0; i < position.size(); i++) { 
            v.push_back(make_pair(position[i],speed[i]));
        }
        sort(v.rbegin(), v.rend());
        vector<double> time;
        int fleets = 0;
        for (int i = 0; i < v.size(); i++) {
            time.push_back((double)(target - v[i].first)/(double)v[i].second);

            if (time.size()>=2 && time.back() <= time[time.size() - 2]) {
                time.pop_back();
            }
        }
        return time.size();
    }
};

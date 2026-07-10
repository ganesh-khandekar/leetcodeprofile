class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        vector<vector<int>> sample_dis;
        vector<vector<int>> org;

        for (int i = 0; i < points.size(); i++) {
            vector<int> vec;
            vec.push_back(((points[i][0]) * (points[i][0])) + ((points[i][1]) * (points[i][1])));
            vec.push_back(i);
            sample_dis.push_back(vec);
            vec.pop_back();
            vec.pop_back();
        }        
        while (sample_dis.size() > k) {
            int max = sample_dis[0][0];
            int index = 0;
            for (int i = 0; i < sample_dis.size(); i++) {
                if (max < sample_dis[i][0]) {
                    index = i;
                    max = sample_dis[i][0];
                }
            }
            sample_dis.erase(sample_dis.begin() + index);
        }
        for (int i = 0; i < sample_dis.size(); i++) {
            int index = sample_dis[i][1];
            org.push_back(points[index]);
        }
        return org;
    }
};
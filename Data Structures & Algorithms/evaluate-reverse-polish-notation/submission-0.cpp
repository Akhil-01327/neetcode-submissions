class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<string> s;
        for (string token : tokens) {
        if (token != "+" && token != "-" && token != "*" && token != "/") {
            s.push(token);
        }
        else {
            string s1 = s.top();
            s.pop();
            int i1 = stoi(s1);
            string s2 = s.top();
            s.pop();
            int i2 = stoi(s2);
            if (token == "+") {
                string s3 = to_string(i1 + i2);
                s.push(s3);
            }
            else if (token == "-") {
                string s3 = to_string(i2 - i1);
                s.push(s3);
            }
            else if (token == "*") {
                string s3 = to_string(i1 * i2);
                s.push(s3);
            }
            else if (token == "/") {
                string s3 = to_string(i2 / i1);
                s.push(s3);
            }
        }

    }
    string ans = s.top();
    int ans_i = stoi(ans);
    return ans_i;
    }
};

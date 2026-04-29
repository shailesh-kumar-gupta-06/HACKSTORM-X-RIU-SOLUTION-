

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    long long k;
    cin >> n >> k;

    vector<long long> arr(n);
    for (int i = 0; i < n; i++) cin >> arr[i];

    unordered_set<long long> prefix;
    long long sum = 0;

    for (int i = 0; i < n; i++) {
        sum += arr[i];

        if (sum == k || prefix.count(sum - k)) {
            cout << "YES";
            return 0;
        }

        prefix.insert(sum);
    }

    cout << "NO";
    return 0;
}

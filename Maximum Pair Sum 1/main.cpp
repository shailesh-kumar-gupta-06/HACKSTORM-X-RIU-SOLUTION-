

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    vector<long long> arr(n);
    for (int i = 0; i < n; i++) cin >> arr[i];

    long long first = LLONG_MIN, second = LLONG_MIN;

    for (auto x : arr) {
        if (x > first) {
            second = first;
            first = x;
        } else if (x > second) {
            second = x;
        }
    }

    cout << first + second;
    return 0;
}

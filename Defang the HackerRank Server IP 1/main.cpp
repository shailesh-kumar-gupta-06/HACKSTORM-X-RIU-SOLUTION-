

#include <iostream>
using namespace std;

int main() {
    string address;
    cin >> address;

    for (char ch : address) {
        if (ch == '.') cout << "[.]";
        else cout << ch;
    }
    return 0;
}

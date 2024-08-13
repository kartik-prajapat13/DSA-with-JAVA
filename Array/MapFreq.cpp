#include <bits/stdc++.h> // This includes all standard libraries
using namespace std;

int main() {
    int n;
    cout << "Enter the number of elements: " << endl;
    cin >> n;

    int arr[n];
    cout << "Enter the elements:" << endl;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    unordered_map<int, int> mpp;
    for (int i = 0; i < n; i++) {
        mpp[arr[i]]++;
    }

    int q;
    cout << "Enter the number of queries: " << endl;
    cin >> q;

    
    while (q--) {
        int number;
        cin >> number;

        cout << "Frequency of " << number << ": " << mpp[number] << endl;
    }

    return 0;
}

import Foundation
import DevicePpi

@objc public class ScreenSize: NSObject {

    @objc public func getDevicePPI() -> Double  {
        let ppi: Double = {
            switch Ppi.get() {
            case .success(let ppi):
                return ppi
            case .unknown(let bestGuessPpi, let error):
                // A bestGuessPpi value is provided but may be incorrect
                // Treat as a non-fatal error -- e.g. log to your backend and/or display a message
                print(error)
                return bestGuessPpi
            }
        }()
        print("#### Plugin - Device PPI: ", ppi)

        return ppi

    }
}

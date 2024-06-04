package app.finance.infrastructure;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Component
public class CoinGeckoImpl {

    public Map<String, String> invokeApi(String coin) {
        String url = "https://pro-api.coingecko.com/api/v3/coins/" + coin;

        WebClient.Builder builder = WebClient.builder();

        String json = builder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        if (json == null || json.equals("")) {
                json = builder.build()
                .get()
                .uri(url)
                .retrieve()
                .bodyToMono(String.class)
                .block();

            if (json == null || json.equals("")) {
                throw new RuntimeException("Coin doesn't exist");
            } else {
                return getDataFromResponse(json);
            }
    }

        return getDataFromResponse(json);
    }

    private Map<String, String> getDataFromResponse(String json) {

        String baseTokenName = "";
        String priceUSD = "";

        int baseTokenNameIndex = json.indexOf("\"name\":");
        if (baseTokenNameIndex != -1) {
            int startIndex = json.indexOf("\"", baseTokenNameIndex + 7);
            int endIndex = json.indexOf("\"", startIndex + 1);
            baseTokenName = json.substring(startIndex + 1, endIndex);
        }

        int priceUSDIndex = json.indexOf("\"last\":");
        if (priceUSDIndex != -1) {
            int startIndex = json.indexOf("\"", priceUSDIndex + 7);
            int endIndex = json.indexOf("\"", startIndex + 1);
            priceUSD = json.substring(startIndex + 1, endIndex);
        }

        return Map.of(
                "name", baseTokenName,
                "priceUSD", priceUSD
        );
    }
}

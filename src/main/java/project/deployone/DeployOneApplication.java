package project.deployone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeployOneApplication {

    public static void main2(String[] args) {
        SpringApplication.run(DeployOneApplication.class, args);
    }
    public static void main(String[] args) {

        String dd = """
                LS0tLS1CRUdJTiBSU0EgUFJJVkFURSBLRVktLS0tLQpNSUlFcEFJQkFBS0NBUUVB Nm1SUWFqSDBwVDY4VGgzcWJTNTJlVkp0eTlGajhTbVFlb2JVWk9pcFFPVTBKRjF6 CkdoUHdELzh2YjlZcjVSTnpRb1Y5Y0xIUk9USzMxWVFHSUdoVlNHRTlMUktudjlj dHp3azZQKzdwMktnVGtzVjAKTXNvWEpPVWJYN25oTlJ5bWtlU3lFRHlxVmFrbjZ4 ZGRubEVDUjFleFBqOHFuRFphUFFDNVI4eXZWdXN4d0d6TgpEUzRtekpFT1AwL284 ajZpZ28zWkI5QzJ5Tk9Bc3JlWEtXSDdMdjFyTy9jV2E1WG9tMlluSitBRFljMG56 QWhxCnRZVDVtQnpQd3IxV0RXRnJUcE51ejFUa2Z1M1l2TmJON0lYdER3T3JkSXBI VFlKTGVYVUhVeXFXR2V5RHdkYlAKZjFKUUpTcHNMMy9BdldUNHdmYmRINTFEZ05K Y0F4V0xLdWJXdFFJREFRQUJBb0lCQUNqbmVyVWRwTEVWd3F6cgpRWmJ1TGRTOFV0 Ym40c1lhVjlGYUtFUzM2Wm1lcGp2V1p4amM4OThHekpONno4dzVXYnI1S3N2NDdD ZE1ONUsyCmFJOU5SZHpNdzIxVFBSMFlnekVIVGpnTURKazNzN3JBWktmY1pxK1Vu L05Uci82aDBsdlJpbFdWRUxERVJXZ2MKZXNUL0pDT3BKUkJVMjYzSk9uUTg1Umlu bXMzVEJpRUtwMVh3b2FabEhqekw4cUFxMit6cEhrazNnQkVZY3p0RQpNT1o0QnFI YThrNHU4Njh6UEJOcEpJUkhnWTBYQkVIYnpFZFMvM0ErYjk4Q2ZlUGEyUGh3ZGY5 QnRDeWFPRVhYClJIWEo4cktGOTdyZVNXQS84MVNQakxkckZJSVlJV1lGVUorME9z M1ZiUk12a2RtK1Jmemc4MldoT3phNjZVdEQKWDhveSsrRUNnWUVBL0pPMktRL3Vx djJ3TlUvWUthdGl2K2pHdnRydGI2SWdXL0FNSk5Ha005QmxZMTU0bnM1Kwp1TjRX VTA4RjZ6UDdBU0dMYU9oaGtCZlljMVh5Rm12VmUyTFh2c1FRZlNFcWNweFp1Vkdi Z1NHZlU2V04xWHBkCnlMNUZVQ01ZUnR3ck82UHNreDY1N0hhVndCV0IycCt0YjVo Nm1PSHYwUzhPODl2WTd2c1hqQTBDZ1lFQTdaR0MKMis5SUN4V1NFTlF6VlhIdnNV WExQU0YvMkJma2lXRnRKbEJLRGNwbTltYzJ3T1RQSUxwbHB5NjhwRDNWczhZNApZ RTA3blMzYWt2YXJDbndnbHdIV29LeEJoMjlaRHNrQWR3QndKdTVMZUNKTURxZGw0 VDdJR0orejJsUU9td3RYCjFWaCs1OVVxTEhVSWpYaHZPSUxNQTBWaXdaLzlwZTJF WkkwS3cwa0NnWUVBdHhFazdkd3pZOUllUG5YUnVsb1QKWi8rQzFlQitTZlJidWVk aUZlbXhOekRyMjdza2VBNDVRU3NQU1hDMFhJYS9mbEZlNXpuUFJRNVRmejBqQzJj NwpRNFFmMVkvc1Y1V0xXNmpCUzVXL3ZUZXVjSVZGS1I3WkRPQUVBeEo4elJkVmFw UGtxN21RanJoZ3orbUd4ZndJClRDTmJjS1lLR1RjZmdsYXRoSUdQenAwQ2dZQWNF bFdrSjJJYjdUQ1ZUSDNFV3ZJM3dFZURzYkdwbHlrcUVwa1QKTGVtU041aHpCVDh6 QzladHg1aTdhSXBoM2V5aWtZbVgxNGh6eWpkSnBsd1BvUnM0dkw3ZnZYc0F4ZWVB RjhBMgpUNWJ4QXJkb09xVkNGZ1d6MS9kTThaSU8rbCsvY2xldW5nWmczbzlkTVhj UlFHbmtBNUNYMGxzWkJnNnl6SjRZClE1SkNBUUtCZ1FDS2lFbmxJQUpNVHpHUkhF M2RZYmF2T3M5ODNTTG5zVXc4WFFsSWZNcVBVb0xRNEo1djRRbk4KUmJHdVR4bmNz Ynk3a1YzdjFTZ0s4K3JVUDEzb3BXZzNKdDBHeVdTWE5pa2xSNEZMekRFdjg2eGUr eitpUUlBUgpSZmFoY0dKbkVGbThCQW1SV2lFM05yK0ZOUkxxTHc1Z2R3QjlUcVIy NHJUNTVpbkJFMG5IaFE9PQotLS0tLUVORCBSU0EgUFJJVkFURSBLRVktLS0tLQ==
                """;
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = dd.trim().split(" ");
        for (int i = 0; i < split.length; i++) {
            System.out.println(i);
            stringBuilder.append(split[i]);
        }
        System.out.println("RESS:" + stringBuilder);
    }


}

